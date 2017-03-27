# VectorDemo
1.SVG资源与普通图片资源区别
普通图片资源的渲染时基于像素点,会失真，通过CPU计算的，考虑到GPU的硬件加速，所以效率会比较高，Vector是需要CPU计算的，没有硬件加速，如果pathData过于复杂效率比较低，但是不会失真

2.android中SVG(Vector)与web中的SVG的关系
SVG在前端中使用，是一套语法规范
Vector只实现了SVG语法的Path标签，可以通过工具把普通SVG资源转化成Android中的SVG

3.在android中使用SVG
在AS中有一个Vector Asset工具可以生成SVG资源，它支持直接导入一些AS自带的Material Icon，也支持将本地的原生SVG转化成Vector

4.android中使用SVG的优势
除了效果比较好之外，SVG在体积上也有很大优势，Vector的大小一般是同等效果PNG资源的25%

5.Vector的兼容问题
一开始Vector只能在android5.0及以上的版本上使用，后来在Gradle1.5上做了兼容，在编译期对Vector对了处理，5.0以上继续使用Vector，在5.0以下转化成PNG
最重要的兼容是在AppCompat23.2上，静态Vector支持了Android2.1+，动态Vector支持3.0+，基本做到了全android使用

6.在项目中使用Vector的一些配置
需要在Module的gradle中配置：
defaultConfig {vectorDrawables.useSupportLibrary = true}
dependencies { compile 'com.android.support:appcompat-v7:25.2.0'}
如果在Gradle1.5上还需要其他配置：
defaultConfig {
vectorDrawables.useSupportLibrary = true
generatedDensities = []
}
aaptOptions{additionalParameters "--no-version-vectors"}

7.在项目中使用Vector
①在ImageView中使用app:srcCompat="@drawable/left"
②如果要设置background(带状态的)，那就不能直接使用，要将Vector包在Selector中再设置，这样才能正常显示。
如果在AppCompat23.2中还需要设置 AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
在AppCompat25.2中就不需要设置了
