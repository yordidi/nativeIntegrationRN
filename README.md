2021.11.29

## RN集成到现有Android项目
两种方式：
1. 官网+ git subModule。这种方式需要修改Android项目的文件夹名称，这个倒无所谓。
2. 通过软链接。软链接也许可以解决文件夹名称的问题，但也许带来一些路径引用的问题。
综合考虑，还是用第一种方案

3. 我晕~ cli复制的android项目可以运行成功，自己创建的android项目怎么都运行不成功？  这个问题卡了我半天，原来是有个debug文件夹，这个文件夹是专门给react native调试用的
4. 不过我把signingConfigs 注释了，不知道这个配置项是干什么用的。
5. 现在总结一下，RN集成到现有的Android项目
1）可以参照官网新建一个MyReactActivity文件，不可以只用一个Activity继承ReactActivity就完了
2）不过我猜想，如果实现了MainApplication估计也是可以的。
3）其实官网的MyReactActivity类倒也好，更简洁。