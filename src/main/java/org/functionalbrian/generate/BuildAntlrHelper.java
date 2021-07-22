package org.functionalbrian.generate;

import com.google.common.collect.ImmutableList;
import org.antlr.v4.Tool;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class BuildAntlrHelper {
	public static void main(String [] args) {
		final BuildAntlrHelper mbp = new BuildAntlrHelper();
		mbp.generateTestCode();
	}

	public class OptionBuilder {
		private ImmutableList.Builder<String> options = new ImmutableList.Builder();
		private String packageName;
		private String outputdirectory;

		public OptionBuilder addOutputDirectory(String dirName, String... moreDirNames ) {
			this.outputdirectory = Paths.get(dirName, moreDirNames).toString();
			return this;
		}

		public OptionBuilder addEncodingUTF8() {
			options.add("-encoding", StandardCharsets.UTF_8.name());
			return this;
		}

		public OptionBuilder generateParseTreeVisitor() {
			options.add("-visitor");
			return this;
		}

		public OptionBuilder generateParseTreeListener() {
			options.add("-listener");
			return this;
		}
		//generate rule augmented transition network diagrams
		public OptionBuilder generateAugmentedTransitionNetworkDiagram() {
			options.add("-atn");
			return this;
		}


		public OptionBuilder setPackageName(String packageName) {
			this.packageName = packageName;
			options.add("-package").add(packageName);
			return this;
		}

		public String[] build() {
			if (packageName != null && outputdirectory != null) {
				String packdir = packageName.replace('.', File.separatorChar);
				outputdirectory = outputdirectory + File.separatorChar + packdir;
				options.add("-o", outputdirectory);
			}

			return options.build().toArray(new String[]{});
		}

		public OptionBuilder setGrammerToParse(String fileName) {
			final URL fileUrl = this.getClass().getResource("/" + fileName);
			final String fullPathName = fileUrl.getFile().toString();
			options.add(fullPathName);
			return this;
		}
	}

	private String[] helloWorldOptions() {
		final String packageName = "org.functionalbrian.helloparser";
		final String grammar = "Hello.g4";
		return buildOptions(packageName, grammar);
	}

	public void generateTestCode() {
		final String[] options = testOptions();
		generateCode(options);
	}

	private void generateCode(String[] options) {
		Tool tool = new Tool(options);
		tool.processGrammarsOnCommandLine();
	}


	private String[] testOptions() {
		String packageName = "org.functionalbrian.testparser";
		String grammar = "Test.g4";
		return buildOptions(packageName, grammar);
	}

	private String[] buildOptions(String packageName, String grammar) {
		final OptionBuilder op = new OptionBuilder();
		op.addOutputDirectory("src/main/java/")
				.addEncodingUTF8()
				.generateParseTreeVisitor()
				.generateParseTreeListener()
				.setPackageName(packageName)
				.setGrammerToParse(grammar);
		final String[] options = op.build();
		return options;
	}
}
