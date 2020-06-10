package org.example.patterns.pipeline;

import org.example.patterns.stage.Stage;

/**
 * A pipeline that can hold a list of stages and execute them in sequence
 *
 */
public interface Pipeline<T> {

	/**
	 * Add a Stage to the pipeline
	 * 
	 * @param stage
	 */
	void add(Stage<T> stage);
	
	/**
	 * Execute all the stages in sequence
	 */
	void execute();
}
