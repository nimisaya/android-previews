# @Preview
-----------

The Preview annotation (`@Preview`) allows us to quickly and easily look at UI created using Jetpack Compose in Android Studio. In this repo I explore some of the different ways we can use it.

## What's in this repo?

- [Basic Preview](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/BasicPreviews.kt#L9-L15)
- [Show a background](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/BasicPreviews.kt#L17-L30)
- [Set dimensions](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/BasicPreviews.kt#L32-L46)
- [Change the font scale](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/BasicPreviews.kt#L48-L60) 
- [Specify API level](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/BasicPreviews.kt#L62-L85)
- [Check out how it looks on different devices](https://github.com/nimisaya/android-previews/blob/main/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/DevicePreviews.kt)
- [Stack previews](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/MultiplePreviews.kt#L15-L27)
- [Multipreview annotation](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/MultiplePreviews.kt#L29-L70)
- [Combining Multipreviews - includes using two languages](https://github.com/nimisaya/android-previews/blob/a67b66d2e1e0895fa9da035ee85ad86e9a3cef33/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/MultiplePreviews.kt#L72-L114)
- [Using Preview Parameters](https://github.com/nimisaya/android-previews/blob/main/app/src/main/java/com/kotlindojo/learningpreviews/ui/previews/SampleDataPreviews.kt)

## Getting started with Previews

To preview your Composable create a function with both `@Preview` and `@Composable` annotations and call the composable you want to preview. 

```kt
// 1. Create your composable function
@Composable
fun YourComposableFunction() {
    Text(text = "Hello Universe")
}

// 2. Preview your composable
@Preview
@Composable
fun YourComposableFunctionPreview() {
  YourComposableFunction()
}
```

Build the app and open either "Split" or "Design" view in Android Studio to see your UI: 

![Open preview pane in Android Studio](https://user-images.githubusercontent.com/7950697/204269502-9b5a60e9-72d9-44f3-8ec1-8d6fd56360bc.png)

You can also run the preview to view it in the emulator or on your device:

![Run preview on your device](https://user-images.githubusercontent.com/7950697/204270446-97806184-e4f1-42c7-83c1-22280e2fc5d5.png)

Once you have your basic preview working you can dive deeper to explore different ways of previewing composables.

Hint: If you don't want to type out `@Preview` all the time you can simply type `prev` and it will set up the preview function for you:

```kt
@Preview
@Composable
fun () {
    
}
```

### Preview Groups

To view the different preview groups go to the dropdown in the top left corner of the preview pane and select the group you are interested in.

![Select a preview group](https://user-images.githubusercontent.com/7950697/204507478-7fcab176-444f-4577-8ed3-82469885c618.png)


