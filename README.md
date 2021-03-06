# Animated Splash

[![](https://jitpack.io/v/pharidali/AnimatedSplash.svg)](https://jitpack.io/#pharidali/AnimatedSplash)
<img src="https://img.shields.io/badge/API-29%2B-green.svg?style=plastic" border="0" alt="API">

Awesome-looking customizable splash screen

<img src="https://github.com/ViksaaSkool/AwesomeSplash/blob/master/rdme/logo_promo.gif" width="210" height="330"/>
<img src="https://github.com/ViksaaSkool/AwesomeSplash/blob/master/rdme/path_promo.gif" width="210" height="330"/>

Splash screens have been around for quite a while. It's the first thing the users see when they run your app, so make it simple yet eventful and impressionable.
This library does exactly that, provides you with beautiful template screen, with wide range of customizations to fit your concept of the splash screen. 
To be noted, with the last acknowledgement form google that splash screens [got](http://is.gd/2MQzao), having a library that tackles this issue is kind of necessity. 

Ready to see implementation details? Let's scroll.

# Prerequisites/Credits

This library is based and utilizes 3 great libraries:
- [Android View Animations](http://is.gd/BLUMT7)
- [Android FillableLoaders](http://is.gd/0WWbEf)
- [CircularReveal](http://is.gd/xpSITZ)

So before diving into AwesomeSplash library, look into the libraries. Especially make sure you understand the concept of
[SVG path](http://is.gd/0WWbEf) and look deeply on how to [create](http://is.gd/KfljPg) you custom svg (and get the string values needed for AwesomeSplash).

# Usage

Add this to your build.grade:
```javascript
	repositories {
	//...
        maven { url "https://jitpack.io" }
    }
```
and then in dependencies:
```javascript
	dependencies {
	        implementation 'com.github.pharidali:AnimatedSplash:1.0.0'
		
		implementation 'com.daimajia.androidanimations:library:2.4@aar' //optional
	}
```

Here is how you utilze the library in your java code:

```java
//extends AnimatedSplash!
public class YourActivity extends AnimatedSplash {

	//DO NOT OVERRIDE onCreate()!
	//if you need to start some services do it in initSplash()!


	@Override
	public void initSplash(ConfigSplash configSplash) {

			/* you don't have to override every property */

			//Customize Circular Reveal
			configSplash.setBackgroundColor(R.color.primary); //any color you want form colors.xml
			configSplash.setAnimCircularRevealDuration(2000); //int ms
			configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
			configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

			//Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

			//Customize Logo
			configSplash.setLogoSplash(R.mipmap.ic_launcher); //or any other drawable
			configSplash.setAnimLogoSplashDuration(2000); //int ms
			configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)


			//Customize Path
			configSplash.setPathSplash(Constants.DROID_LOGO); //set path String
			configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
			configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
			configSplash.setAnimPathStrokeDrawingDuration(3000);
			configSplash.setPathSplashStrokeSize(3); //I advise value be <5
			configSplash.setPathSplashStrokeColor(R.color.accent); //any color you want form colors.xml
			configSplash.setAnimPathFillingDuration(3000);
			configSplash.setPathSplashFillColor(R.color.Wheat); //path object filling color


			//Customize Title
			configSplash.setTitleSplash("My Awesome App");
			configSplash.setTitleTextColor(R.color.Wheat);
			configSplash.setTitleTextSize(30f); //float value
			configSplash.setAnimTitleDuration(3000);
			configSplash.setAnimTitleTechnique(Techniques.FlipInX);
			configSplash.setTitleFont("fonts/myfont.ttf"); //provide string to your font located in assets/fonts/

	}

	@Override
	public void animationsFinished() {

			//transit to another activity here
			//or do whatever you want
	}
}
```

License
--------

    The MIT License (MIT)

    Copyright (c) 2020 Pharid Ali
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.


# Maintained & Upgraded By
Pharid Ali
</br>
<a href="https://linkedin.com/in/pharidali">
  <img alt="Add me to Linkedin" src="http://is.gd/u42ILV" width="96" height="96"/>
</a>

# Developed By
Viktor Arsovski

