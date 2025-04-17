file:///C:/Users/moham/code_projects/catalogic/app/src/main/java/catalogic/HealthEndpoint.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 249
uri: file:///C:/Users/moham/code_projects/catalogic/app/src/main/java/catalogic/HealthEndpoint.java
text:
```scala
package catalogic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CatalogicPingEndpoint e@@ {

    @GetMapping("/ping")
    public String ping(@RequestParam String param) {
        return "PONG! Catalogic is up...";
    }
    

}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:935)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:164)
	dotty.tools.pc.CachingDriver.run(CachingDriver.scala:45)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:72)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator