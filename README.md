# BSDSwitchToggle
Switch per android con effetti on/off

Esempio di utilizzo nel progetto AccertaMobile.

Utilizzo
-----

Includere `BSDSwitchToggle` nel layout XML.

```xml
<it.bsdsoftware.library.BSDSwitchToggle
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:checked="true"
                android:layout_marginEnd="16dp"
                android:id="@+id/switch" />
```

Per cambiare da codice lo stato del check utilizzare i metodi realChecked invece dei semplici checked.
```java
    switch.setRealChecked(false);
    
    switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                BSDSwitchToggle bsdSwitchToggle = (BSDSwitchToggle) buttonView;
                if(bsdSwitchToggle.isRealChecked()){
                    //TODO
                }
            }
        });
```

Download
--------

Aggiungere al repository il percorso:
```groovy
repositories {
        jcenter()
        maven {
            url "http://dl.bintray.com/bsdsoftware/bsdsoftware"
        }
    }
```
e nel gradle file la dipendenza:
```groovy
compile 'it.bsdsoftware:bsd-switch-toggle:1.1'
```


