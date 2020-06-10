package org.example.patterns;

import org.example.patterns.models.Messages;
import org.example.patterns.pipeline.Pipeline;
import org.example.patterns.pipeline.ProcessMessagesPipeline;
import org.example.patterns.stage.CreateMessagesStage;
import org.example.patterns.stage.OutputMessagesStage;
import org.example.patterns.stage.RemoveDuplicatesStage;
import org.example.patterns.stage.SortMessagesStage;

public class ProcessMessagesMain {

	public static void main(String[] args) {
		Pipeline<Messages> pipeline = new ProcessMessagesPipeline();
		
		pipeline.add( new CreateMessagesStage() );
		pipeline.add( new RemoveDuplicatesStage() );
		pipeline.add( new SortMessagesStage() );
		pipeline.add( new OutputMessagesStage() );
		
		pipeline.execute();
	}
}
