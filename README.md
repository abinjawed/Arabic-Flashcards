# Simply Arabic
This is a packaged solution to give you a crash course in the Arabic vocabulary.

## Install

Download: This app is available for download at [Google Play Store](https://play.google.com/store/apps/details?id=com.learnsimply.arabic&hl=en_US&gl=US).

### Environment
To deploy on Google Play, the `Android SDK` is required, which can be installed on most operating systems (Windows, MacOS, or Linux):
https://developer.android.com/studio

The mobile app framework had its HTML,CSS, JavaScript was wrapped in Apache Cordova: https://cordova.apache.org/

You may need to install intexl `HAXM` manually to Windows of Mac if unable to install it in Android Studio: 
https://github.com/intel/haxm/

### Code
The Cordova command-line runs on `Node.js` and is available on NPM: https://nodejs.org/en/

### Run
You need to configure your environment variables, `JAVA_HOME`, `ANDROID_HOME` and `PATH`.

`JAVA_HOME` must contain the path to java, and you should add %JAVA_HOME%\bin to `PATH`

If you do not need Android Studio, you can download the basic Android command line tools to acces `SDK` packages:
https://developer.android.com/studio?gclid=EAIaIQobChMIi-3w3t_d8AIViiitBh0-DwWHEAAYASAAEgLHF_D_BwE&gclsrc=aw.ds

Depending on which Windows Edition you have, you may not have Windows Server Virtualization, such as `Hyper-V` available on your system.

If you are unable to install Intel `HAXM` in Android Studio, you may need to try installing it manually on your Windows OS or MacOS.

### Setting up an Emulator
If you don't want to physically connect a device to test your Cordova app, you can run it on an Android emulator.

First, you will first need to create an Android Virtual Device (AVD).
