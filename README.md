## 脏标记模式

游乐园里设有自助咖啡机，咖啡机中咖啡豆的容量有限，每次制作咖啡需要消耗一定量的咖啡豆，当咖啡豆用完时就需要管理员进行添加才能继续正常运行。管理员对咖啡机进行日常维护时，需要查看咖啡豆是否用完，如果用完则需要添加咖啡豆。维护结束之后，需要计算维护费用并上报。如果需要添加咖啡豆，则维护费用包括基础维护费用和咖啡豆费用两部分；如果不需要添加咖啡豆，则只需要上报基础维护费用。

为了节省计算费用的时间，采用了脏标记模式。给咖啡机添加一个脏标记，当咖啡豆用完时脏标记置为true，否则脏标记为false。管理员维护咖啡机时，需要查看脏标记是否为真，若为假则只需要维护并上报维护的基本费用；若为真则需要添加咖啡豆并在基本费用基础上加上咖啡豆的费用作为维护费用。


该模式涉及到CoffeeMachine(咖啡机)和CoffeeMachineManager(咖啡机管理员)两个类。CoffeeMachineManager通过构造器绑定一个CoffeeMachine对象，并通过reportFee()函数对咖啡机进行维护、上报费用操作。

Client端首先创建一个coffeeMachine对象，然后创建一个coffeeMachineManager对象并绑定coffeeMachine对象。然后coffeeMachine执行5次制作咖啡的操作，这时咖啡豆仍有剩余，脏标记为false，coffeeMachineManager执行上报费用操作。然后coffeeMachine再执行6次制作咖啡的操作，执行后咖啡豆耗尽且最后一次制作失败，脏标记为true，最后coffeeMachineManager再执行一次上报费用操作。

## 雇工模式

游乐园中的雇工需要为顾客提供各种不同类型的服务，如清洁服务、食品服务、医疗服务等。这些服务本来应该由不同的工作人员来提供，如清洁服务由清洁工提供、食品服务由售货员提供、医疗服务由医护人员提供，但是这样设计就会使系统较为复杂。因此这里将提供服务的这些工作人员全部抽象为一个Servant(雇工)类，由雇工来执行所有的服务，这就是雇工模式。雇工模式是行为模式的一种，它为一组类提供通用的功能，而不需要类实现这些功能，它是命令模式的一种扩展。

关于这里采用雇工模式而不采用命令模式的原因如下：

对于雇工模式和命令模式的区别，维基百科上是这样写的：

Design patterns [Command](https://en.wikipedia.org/wiki/Command_pattern) and Servant are very similar and implementations of them are often virtually the same. The difference between them is the approach to the problem.

- For the Servant pattern we have some objects to which we want to offer some functionality. We create a class whose instances offer that functionality and which defines an interface that serviced objects must implement. Serviced instances are then passed as parameters to the servant.
- For the Command pattern we have some objects that we want to modify with some functionality. So, we define an interface which commands which desired functionality must be implemented. Instances of those commands are then passed to original objects as parameters of their methods.

简单来说就是雇工模式是给对象提供一些功能，而命令模式是用一些功能来改变对象。在这个场景中游客的不同需求被满足，更符合前一种场景。而只需要一个雇工类来执行不同的操作，简化了不同的工作人员提供不同服务的这一环节，降低了系统的复杂度。


雇工模式涉及到5个类，其中三个类不同的服务对应三个类(CleaningServiced, FoodServiced, MedicalServiced)，这三个类都使用了接口类IServiced，而雇工类Servant通过接口类IServiced访问三个服务类并执行服务操作。

Client端首先创建一个servant(雇工)对象。然后对清洁服务进行测试：先创建一个cleaningServiced(清洁服务)对象，然后雇工类对cleaningServiced执行服务操作，最后用断言检查清洁服务是否已被执行。食品服务和医疗服务的测试流程与清洁服务相同。
