# 关于采用雇工模式而不采用命令模式的原因

对于雇工模式和命令模式的区别，维基百科上是这样写的：

Design patterns [Command](https://en.wikipedia.org/wiki/Command_pattern) and Servant are very similar and implementations of them are often virtually the same. The difference between them is the approach to the problem.

- For the Servant pattern we have some objects to which we want to offer some functionality. We create a class whose instances offer that functionality and which defines an interface that serviced objects must implement. Serviced instances are then passed as parameters to the servant.
- For the Command pattern we have some objects that we want to modify with some functionality. So, we define an interface which commands which desired functionality must be implemented. Instances of those commands are then passed to original objects as parameters of their methods.

简单来说就是雇工模式是给对象提供一些功能，而命令模式是用一些功能来改变对象。在这个场景中游客的不同需求被满足，更符合前一种场景。而只需要一个雇工类来执行不同的操作，简化了不同的工作人员提供不同服务的这一环节，降低了系统的复杂度。
