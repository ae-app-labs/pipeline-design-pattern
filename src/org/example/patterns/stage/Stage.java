package org.example.patterns.stage;

/**
 * A Stage 
 * 
 * @param <T>
 */
public interface Stage<T> {

	/**
	 * Executes a stage consuming the input and producing an output
	 * 
	 * @param input
	 * @return
	 */
	T execute(final T input);
	
}
