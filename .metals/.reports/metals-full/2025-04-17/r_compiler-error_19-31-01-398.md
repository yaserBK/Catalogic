file:///C:/Users/moham/code_projects/catalogic/app/src/main/java/catalogic/HealthEndpoint.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 244
uri: file:///C:/Users/moham/code_projects/catalogic/app/src/main/java/catalogic/HealthEndpoint.java
text:
```scala
package catalogic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.Re@@questParam;


@Controller
class HealthEndpoint {
  @RequestMapping("/hello")
  public String requestMethodName(@RequestParam String param) {
      return new String();
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
	dotty.tools.pc.HoverProvider$.hover(HoverProvider.scala:40)
	dotty.tools.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:389)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator