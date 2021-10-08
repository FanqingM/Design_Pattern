# Design_Pattern

## 本项目JDK版本是1.8
**online 的那个package我忘了建了，他在main底下与offline和util时同级的package**

## git合作流程
一般来说，master（main）上是我们最终的发行版本，当然他可能有多版，dev是测试版本，我们需要在自己的分支上编写并测试完成后，将自己的分支merge到dev上。
您一般进行开发时，需要从dev上merge最新版本到您的分支上，当开发与测试完成后您需要将您的版本merge到dev上。
**切忌不要在main（master）和dev上开发，切忌不要merge到master（main）上，或者在别人的分支上开发**

## 代码规范
这里我们采用了checkstyle插件，我们当然可以使用现成的google test 或者 alibaba test，但是其要求过于严格，我们可以先按照我下面所列的简单代码规范进行编写，当项目具备一定雏形时我们可以独自编写xml文件导入checkstyle

### 我们的代码规范
- 包名全小写，类名大驼峰，方法名和变量名都小驼峰
- 关于包的结构如项目中所示，您需要在您对应的包里进行开发，您需要在您给定的分区底下建立包，并在这个包底下新建class or interface等文件进行开发，在test文件夹中生成对应test的class的方法请自行上网查找
- ~~您的输出语句需要尽可能的调用工具包（util）中的Log以及LogInfo函数来保证我们输出格式的规范，具体使用请看关于chair的例子~~,暂时不需要这个，就先都用sout
- 您在新建一个文件（包括main中和test中）的时候，需要在package与import之间指出author和该文件的description，具体请看chair的例子
- 您在每新建一个函数的时候，需要在函数前给出注释，表明该函数的功能
- 现阶段您只需要关注src文件夹下的main下的java以及test下的java，并不需要关心其他。所以请勿修改build.gardle或者setting.gradle文件以及我们.idea中的配置文件，如果有需求请群内指出

## 分工
xsc和lyz做online，其余六人做offline

## 关于commit
不需要用英文，也不必采用过于严格的commit格式，我们的commit最好满足下面三个要求
- fix: 修改了what
- feat: 添加了什么功能
- doc: 添加了什么文档（注释）

## PS
如果您需要运行main函数，可以使用，如果报权限错误，您需要给这个命令赋予权限 chmod +x gradlew
```
./gradlew run
```
关于test指定的方法，我们目前还没用在build.gradlew中添加，您目前需要在IDEA中运行
