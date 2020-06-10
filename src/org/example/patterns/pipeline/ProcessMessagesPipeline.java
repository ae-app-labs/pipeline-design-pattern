package org.example.patterns.pipeline;

import java.util.ArrayList;
import java.util.List;

import org.example.patterns.models.Messages;
import org.example.patterns.stage.Stage;

/**
 * An implementation of the Pipeline that processes Messages 
 */
public class ProcessMessagesPipeline implements Pipeline<Messages> {

	List<Stage<Messages>> stages = new ArrayList<Stage<Messages>>();

	@Override
	public void add(Stage<Messages> stage) {
		stages.add(stage);
	}

	@Override
	public void execute() {
		// Input to first stage is empty in this example
		Messages input = null, output;

		for (Stage<Messages> stage : stages) {
			output = stage.execute(input);

			input = output;
		}
	}

}
