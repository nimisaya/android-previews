# @Preview
-----------

The Preview annotation (`@Preview`) allows us to quickly and easily look at UI created using Jetpack Compose in Android Studio. In this repo I explore some of the different ways we can use it.

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

![previewAndroidStudio](https://user-images.githubusercontent.com/7950697/204269502-9b5a60e9-72d9-44f3-8ec1-8d6fd56360bc.png)

You can also run the preview to view it in the emulator or on your device:

![RunPreview](https://user-images.githubusercontent.com/7950697/204270446-97806184-e4f1-42c7-83c1-22280e2fc5d5.png)

Once you have your basic preview working you can dive deeper to explore different ways of previewing composables.

Hint: If you don't want to type out `@Preview` all the time you can simply type `prev` and it will set up the preview function for you:

```kt
@Preview
@Composable
fun () {
    
}
```
## What's in this repo?

- 
