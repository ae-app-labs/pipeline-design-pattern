#pipeline design pattern
This is an example project that implements the Pipeline Design Pattern.
A pipeline can be used to process information in a sequence where the output of a stage serves as the input to the next stage.

The advantage is the flow of control can be defined at a single place and each Stage can have the logic to convert the input into an output.

At its core, there is a `Pipeline` and a number of `Stages` that form the different steps in the pipeline.
They are defined in this example implementation as below.

```java
public interface Pipeline<T> {

	void add(Stage<T> stage);
	
	void execute();
}

public interface Stage<T> {

	T execute(final T input);
	
}
```

Next we provide an implementation for the pipeline, define and create a number of stages.
Finally all of this are executed like this:

```java
	Pipeline<Messages> pipeline = new ProcessMessagesPipeline();
	
	pipeline.add( new CreateMessagesStage() );
	pipeline.add( new RemoveDuplicatesStage() );
	pipeline.add( new SortMessagesStage() );
	pipeline.add( new OutputMessagesStage() );
	
	pipeline.execute();
```

The pipe consists of creating some messages, removing duplicates, sorting them and finally printing them out.
Ofcourse we could read the messages from any source, generate a report of some type or update a database with the final stage.

### Input
Assume an input like this, lets say there was a network issue and same messages were posted multiple times.

```
[id=1] Alice : Says Hi
[id=1] Alice : Says Hi
[id=2] Bob : Hi Alice
[id=3] Charles : Hello everyone
[id=4] Alice : Hello Bob
[id=5] Alice : Hello Charles
[id=6] Bob : How are you, Charles?
[id=6] Bob : How are you, Charles?
```

### Output
After executing this pipeline, we could end up with an output like this.

```
[id=1] Alice : Says Hi
[id=2] Bob : Hi Alice
[id=3] Charles : Hello everyone
[id=4] Alice : Hello Bob
[id=5] Alice : Hello Charles
[id=6] Bob : How are you, Charles?
```

## References:
 - https://midhunhk.github.io/dev/2020/03/15/pipeline-design-pattern/
 - https://stackoverflow.com/questions/39947155/pipeline-design-pattern-implementation