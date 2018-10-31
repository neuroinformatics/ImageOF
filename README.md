# ImageOF - Open field test plugin for ImageJ

ImageOF is an ImageJ plugin for Open field test.
This program can work with Image J 1.46 or above on Windows 7 or 10 (32-bit).


## How to build

### prepare
Download java inteface for LabJack U12

```shellscript
 $ curl -LO https://labjack.com/sites/default/files/2012/08/LabJackJavaV40.zip 
 $ unzip -p LabJackJavaV40.zip labjack.jar > lib/labjack.jar
```

Download java package for Scion Frame Grabber FG-7

```shellscript
 $ curl -LO http://imagej.nih.gov/ij/download/tools/ScionDrivers.zip
 $ unzip -p ScionDrivers.zip ScionImageJDrivers/FG-7/ImageJ/SFG_ImageJ_Update64.exe > SFG_ImageJ_Update64.exe
 $ cabextract -p -F scion.jar SFG_ImageJ_Update64.exe > lib/scion.jar 
```

Download java interface for Apple QuickTime 7

http://www.apple.com/quicktime/download/

```shellscript
 $ curl -OL https://secure-appldnld.apple.com/QuickTime/031-43075-20160107-C0844134-B3CD-11E5-B1C0-43CA8D551951/QuickTimeInstaller.exe
 $ cabextract -F QuickTime.msi ./QuickTimeInstaller.exe
 $ msiinfo extract ./QuickTime.msi QuickTime.cab > QuickTime.cab
 $ cabextract -p -F QTJava.zip ./QuickTime.cab > lib/QTJava.zip
```


### compile
Build jar package using Maven

```shcellscript
 $ mvn package
 $ file target/behavior_OF121112.jar
```

## Binary distribution

https://cbsn.neuroinf.jp/modules/xoonips/detail.php?id=ImageOF

Distributed by Keizo Takao and Tsuyoshi Miyakawa.


To get revisions info about ImageOF, please see http://www.mouse-phenotype.org/software.html.


