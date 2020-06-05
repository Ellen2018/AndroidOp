> App稳定性优化学习向导:
>
> - 项目架构:MVC & MVP & MVVM & 组件化 & 插件化
> - Crash监控
> - 热修复
> - 进程保活
> - 代码质量

## 项目架构 & 采取合适的架构

[MVC](https://www.jianshu.com/p/1e2adb415f27)  
[MVP](https://www.cnblogs.com/lixiansheng/p/11382389.html)  
[MVVM](https://www.jianshu.com/p/ef99ff863650)  
[组件化](https://www.jianshu.com/p/8b6e6a50e21e)  
[插件化](https://www.jianshu.com/p/f2e5b7b7f72b)

以上架构都是Android常用架构，比较注意的是MVC & MVP & MVVM是对UI界面进行解耦，而组件化和插件化则是对业务进行解耦，每种架构都有它的好处，你要根据你项目特点选择合适的架构，只有架构合适，app的维护性，扩展性等等才能稳定。  

## Crash监控  

当你的app上架到市场，也就是线上，为了提高用户体验，我们必须对bug进行捕捉，及时进行修复才是对用户体验良好的最大保障，国内有很多crash监控框架，比如腾讯的Bugly,国外市场一般使用Firebase。

[Bugly](https://bugly.qq.com/docs/user-guide/instruction-manual-android/)    
[Firebase](https://www.jianshu.com/p/3434c1297d7f)  

## 热修复

如果您的app上线遇到了紧急的bug需要修复，例如：11.11活动，这么牛的活动，还要再打包上线提示用户更新app?no,这么做非常不好，此时热修复就可以为您尽快修复bug,减少损失。  

[热修复](https://www.cnblogs.com/popfisher/p/8543973.html)  

## 进程保活  

如果想app长期保持活跃状态，那么就需要对进程进行保活,比如:app有个业务就是提示用户xxx活动开始，那么如果进程被系统杀掉，用户肯定就收不到通知了，怎么办呢？这个时候就需要我们对象进程进行保活。

[进程保活](https://zhuanlan.zhihu.com/p/79324310)  

## 代码质量

代码质量的提高不是一日两日就可以提高的，而是保持好撸码习惯，渐渐的你的代码质量就提高了。  

[Java 设计6大原则](https://blog.csdn.net/petterp/article/details/88053378)  
[推荐研读【Effective Java】](https://www.jianshu.com/p/54e122c8e765)  

好的代码质量即是对自己负责，也是对公司负责，产品迭代时不需要填自己坑，也不给他人留坑!
