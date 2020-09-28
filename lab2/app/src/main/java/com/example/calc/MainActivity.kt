package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


import java.lang.reflect.Array.getDouble


class MainActivity : AppCompatActivity() {

    var theFirstText: String?=null
    var theSecondText: String?=null
    var alltext :String?="0"
    var amount: Int=0
    var symbol:Char='='
    var firstDot: Boolean=false
    var secondDot: Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", "onCreate")
        if (savedInstanceState == null) {

        } else {
            alltext = savedInstanceState.getString("alltext")
            theSecondText=savedInstanceState.getString( "theSecondText")
            theFirstText=savedInstanceState.getString("theFirstText")
            amount=savedInstanceState.getInt("amount")
            symbol=savedInstanceState.getChar("symbol")
            firstDot=savedInstanceState.getBoolean("firstDot")
            secondDot=savedInstanceState.getBoolean("secondDot")


            }


        button1.setOnClickListener { view ->
            Text1.setText("0")
            alltext = "0"
            theFirstText = null
            theSecondText = null

            amount = 0
            firstDot=false
            secondDot=false
            text2.setText("=")
        }
        Button2.setOnClickListener { view ->

            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str=str.substring(0,str.length-1)
                    alltext=str
                Text1.setText(alltext + "7")
                alltext += "7"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "7"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "7")
                alltext += "7"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "7"
                } else theFirstText += "7"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "7"
                } else theSecondText += "7"
            }

            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
        }
        Button3.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str= str!!.substring(0, str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "4")
                    alltext += "4"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "4"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "4")
                alltext += "4"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "4"
                } else theFirstText += "4"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "4"
                } else theSecondText += "4"
            }

            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")
        }
        Button4.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str= str!!.substring(0,str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "1")
                    alltext += "1"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "1"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "1")
                alltext += "1"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "1"
                } else theFirstText += "1"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "1"
                } else theSecondText += "1"
            }

            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")
        }
        Button5.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str=str!!.substring(0,str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "0")
                    alltext += "0"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "0"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "0")
                alltext += "0"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "0"
                } else theFirstText += "0"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "0"
                } else theSecondText += "0"
            }

            Text1.setText(alltext)
            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")
        }
        Button21.setOnClickListener { view ->
            if(theFirstText==null){
                alltext="0"
                Text1.setText(alltext)
                text2.setText("=0")
            }
            else if(theFirstText!!.length==1 && amount==0 ){
                theFirstText=null;
                alltext="0"
                Text1.setText(alltext)
                text2.setText("=0")
            }
            else{
                if(amount==0){
                    theFirstText=theFirstText!!.substring(0,theFirstText!!.length-1)
                    alltext=theFirstText
                    Text1.setText(alltext)
                    text2.setText("=$alltext")
                }else{
                    if(theSecondText==null){
                        amount=0
                        alltext=alltext!!.substring(0,alltext!!.length-1)
                        text2.setText("=$alltext")
                        Text1.setText(alltext)
                    }else if(theSecondText!!.length==1){
                        theSecondText=null
                        alltext=alltext!!.substring(0,alltext!!.length-1)
                        text2.setText("=$theFirstText")
                        Text1.setText(alltext)
                    }
                    else {
                        theSecondText=theSecondText!!.substring(0,theSecondText!!.length-1)
                        alltext=alltext!!.substring(0,alltext!!.length-1)
                        Text1.setText(alltext)
                        var str1 = theFirstText
                        var str2 = theSecondText
                        if (str1 != null && str2 != null) {
                            var num1 = str1.toFloat()
                            var num2 = str2.toFloat()
                            var all: Float = 0.0F

                            if (symbol == '+') {
                                all = num1 + num2
                            } else if (symbol == '-') {
                                all = num1 - num2
                            } else if (symbol == 'x') {
                                all = num1 * num2
                            } else if (symbol == '÷') {
                                all = num1 / num2
                            }

                            text2.setText("=" + all.toString())

                        }

                    }
                }


            }


        }
        Button22.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str=str!!.substring(0,str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "8")
                    alltext += "8"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "8"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "8")
                alltext += "8"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "8"
                } else theFirstText += "8"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "8"
                } else theSecondText += "8"
            }

            Text1.setText(alltext)
            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")

        }
        Button23.setOnClickListener { view ->

            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "5"
                } else theFirstText += "5"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "5"
                } else theSecondText += "5"
            }
            if (alltext != null && alltext != "0") {
                alltext += "5"
            } else {
                alltext = "5"
            }
            Text1.setText(alltext)
            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")

        }
        Button24.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str=str!!.substring(0,str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "2")
                    alltext += "2"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "2"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "2")
                alltext += "2"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "2"
                } else theFirstText += "2"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "2"
                } else theSecondText += "2"
            }

            Text1.setText(alltext)
            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")

        }
        Button31.setOnClickListener { view ->
            if (amount == 0) {
                if (theFirstText != null) {
                    var str = theFirstText
                    if (str != null) {

                        var num = str!!.toFloat()
                        num /= 100
                        firstDot=true
                        alltext = num.toString()
                        Text1.setText(alltext)
                        text2.setText("=" + alltext)
                        theFirstText = num.toString()
                    }
                } else {
                    alltext = "0"
                    theFirstText = "0"
                    Text1.setText("0")
                    text2.setText("=0")
                }
            } else {
                if (theSecondText == null) {
                    amount = 0
                    var str = alltext
                    if (str != null) {

                        str = str!!.substring(0, str!!.length - 1)
                        var num = str!!.toFloat()
                        num /= 100
                        firstDot=true
                        alltext = num.toString()
                        text2.setText("= $alltext")
                        Text1.setText(alltext)
                        theFirstText = num.toString()
                    }
                } else {
                    var str1 = theFirstText
                    var str2 = theSecondText
                    if (str1 != null && str2 != null) {
                        var num1 = str1.toFloat()
                        var num2 = str2.toFloat()
                        var all: Float = 0.0F

                        if (symbol == '+') {
                            all = num1 + num2
                        } else if (symbol == '-') {
                            all = num1 - num2
                        } else if (symbol == 'x') {
                            all = num1 * num2
                        } else if (symbol == '÷') {
                            all = num1 / num2
                        }
                        amount = 0
                        all /= 100
                        theSecondText = null
                        secondDot=false
                        firstDot=true
                        theFirstText = all.toString()
                        alltext = all.toString()
                        text2.setText("=" + alltext)
                        Text1.setText(alltext)
                    }

                }
            }

        }
        Button32.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str=str!!.substring(0,str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "9")
                    alltext += "9"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "9"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "9")
                alltext += "9"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "9"
                } else theFirstText += "9"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "9"
                } else theSecondText += "9"
            }

            Text1.setText(alltext)
            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")

        }
        Button33.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str=str!!.substring(0,str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "6")
                    alltext += "6"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "6"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "6")
                alltext += "6"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "6"
                } else theFirstText += "6"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "6"
                } else theSecondText += "6"
            }
            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }

            else text2.setText("=$theFirstText")
        }
        Button34.setOnClickListener { view ->
            if ((theSecondText=="0" && amount==1)   ) {
                var str=alltext
                if(str!=null){
                    str=str!!.substring(0,str!!.length-1)
                    alltext=str
                    Text1.setText(alltext + "3")
                    alltext += "3"
                }
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "3"
                Text1.setText(alltext)
            }
            else {
                Text1.setText(alltext + "3")
                alltext += "3"
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null) {
                    theFirstText = "3"
                } else theFirstText += "3"
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "3"
                } else theSecondText += "3"
            }


            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")

        }
        Button35.setOnClickListener { view ->
            if (((theSecondText==null || theSecondText=="0") && amount==1)   ) {
            if(theSecondText==null) alltext+="0."
                else alltext+="."

                Text1.setText(alltext)
            } else if((amount==0 && (theFirstText==null || theFirstText=="0"))){
                alltext = "0."
                Text1.setText(alltext)

            }
            else if(amount==0 && !firstDot){
                Text1.setText(alltext + ".")
                alltext += "."

            }
            else if(amount==1 && ! secondDot){

                alltext+='.'
                Text1.setText(alltext)
            }
            if (amount == 0) {
                if (theFirstText == "0" || theFirstText == null )  {
                    theFirstText = "0."
                    firstDot=true
                } else if(!firstDot) {theFirstText += "."
                    firstDot=true  }
            } else {
                if (theSecondText == "0" || theSecondText == null) {
                    theSecondText = "0."
                    secondDot=true
                } else if(!secondDot) {
                    theSecondText +="."
                secondDot=true}
            }

            if (amount == 1) {
                var str1 = theFirstText
                var str2 = theSecondText
                if (str1 != null && str2 != null) {
                    var num1 = str1.toFloat()
                    var num2 = str2.toFloat()
                    var all: Float = 0.0F

                    if (symbol == '+') {
                        all = num1 + num2
                    } else if (symbol == '-') {
                        all = num1 - num2
                    } else if (symbol == 'x') {
                        all = num1 * num2
                    } else if (symbol == '÷') {
                        all = num1 / num2
                    }

                    text2.setText("=" + all.toString())

                }

            }
            else text2.setText("=$theFirstText")

        }

        Button41.setOnClickListener { view ->
            if (theFirstText == null) {
                theFirstText = "0"
                alltext = theFirstText + "÷"
                Text1.setText(alltext)
                text2.setText("=$theFirstText")
                amount = 1
                symbol = '÷'
            } else {
                if (amount == 0) {
                    alltext = theFirstText + "÷"
                    Text1.setText(alltext)
                    text2.setText("=$theFirstText")
                    amount = 1
                    symbol = '÷'
                } else {
                    if (theSecondText == null) {
                        alltext = theFirstText + "÷"
                        Text1.setText(alltext)
                        text2.setText("=$theFirstText")
                        amount = 1
                        symbol = '÷'
                    } else {
                        var str1 = theFirstText
                        var str2 = theSecondText
                        if (str1 != null && str2 != null) {
                            var num1 = str1.toFloat()
                            var num2 = str2.toFloat()
                            var all: Float = 0.0F

                            if (symbol == '+') {
                                all = num1 + num2
                            } else if (symbol == '-') {
                                all = num1 - num2
                            } else if (symbol == 'x') {
                                all = num1 * num2
                            } else if (symbol == '÷') {
                                all = num1 / num2
                            }
                            firstDot=true
                            secondDot=false
                            alltext = all.toString()
                            alltext += '÷'
                            theFirstText = all.toString()
                            text2.setText("=" + theFirstText)
                            Text1.setText(alltext)
                            symbol = '÷'
                            theSecondText = null

                        }

                    }
                }

            }

        }

        Button42.setOnClickListener { view ->

            if (theFirstText == null) {
                theFirstText = "0"
                alltext = theFirstText + "x"
                Text1.setText(alltext)
                text2.setText("=$theFirstText")
                amount=1
                symbol='x'
            } else {
                if (amount == 0) {
                    alltext = theFirstText + "x"
                    Text1.setText(alltext)
                    text2.setText("=$theFirstText")
                    amount=1
                    symbol='x'

                } else {
                    if (theSecondText == null) {
                        alltext = theFirstText + "x"
                        Text1.setText(alltext)
                        text2.setText("=$theFirstText")
                        amount=1
                        symbol='x'
                    } else {
                        var str1 = theFirstText
                        var str2 = theSecondText
                        if (str1 != null && str2 != null) {
                            var num1 = str1.toFloat()
                            var num2 = str2.toFloat()
                            var all: Float = 0.0F

                            if (symbol == '+') {
                                all = num1 + num2
                            } else if (symbol == '-') {
                                all = num1 - num2
                            } else if (symbol == 'x') {
                                all = num1 * num2
                            } else if (symbol == '÷') {
                                all = num1 / num2
                            }
                            firstDot=true
                            secondDot=false
                            alltext = all.toString()
                            alltext+="x"
                            theFirstText=all.toString()
                            theSecondText=null
                            Text1.setText("=" + alltext)
                            text2.setText("=$theFirstText")
                            symbol='x'
                        }

                    }
                }

            }

        }
        Button43.setOnClickListener { view ->

            if (theFirstText == null) {
                theFirstText = "0"
                alltext = theFirstText + "-"
                Text1.setText(alltext)
                text2.setText("=$theFirstText")
                amount=1
                symbol='-'
            } else {
                if (amount == 0) {
                    alltext = theFirstText + "-"
                    Text1.setText(alltext)
                    text2.setText("=$theFirstText")
                    amount=1
                    symbol='-'

                } else {
                    if (theSecondText == null) {
                        alltext = theFirstText + "-"
                        Text1.setText(alltext)
                        text2.setText("=$theFirstText")
                        amount=1
                        symbol='-'
                    } else {
                        var str1 = theFirstText
                        var str2 = theSecondText
                        if (str1 != null && str2 != null) {
                            var num1 = str1.toFloat()
                            var num2 = str2.toFloat()
                            var all: Float = 0.0F

                            if (symbol == '+') {
                                all = num1 + num2
                            } else if (symbol == '-') {
                                all = num1 - num2
                            } else if (symbol == 'x') {
                                all = num1 * num2
                            } else if (symbol == '÷') {
                                all = num1 / num2
                            }
                            firstDot=true
                            secondDot=false
                            theSecondText=null
                            theFirstText=all.toString()
                            alltext = theFirstText + "-"
                            Text1.setText(alltext)
                            text2.setText("=$theFirstText")
                            amount=1
                            symbol='-'

                        }

                    }
                }

            }

        }

        Button44.setOnClickListener { view ->

            if (theFirstText == null) {
                theFirstText = "0"
                alltext = theFirstText + "+"
                Text1.setText(alltext)
                text2.setText("=$theFirstText")
                amount=1
                symbol='+'

            } else {
                if (amount == 0) {
                    alltext = theFirstText + "+"
                    Text1.setText(alltext)
                    text2.setText("=$theFirstText")
                    amount=1
                    symbol='+'


                } else {
                    if (theSecondText == null) {
                        alltext = theFirstText + "+"
                        Text1.setText(alltext)
                        text2.setText("=$theFirstText")
                        amount=1
                        symbol='+'
                    } else {
                        var str1 = theFirstText
                        var str2 = theSecondText
                        if (str1 != null && str2 != null) {
                            var num1 = str1.toFloat()
                            var num2 = str2.toFloat()
                            var all: Float = 0.0F

                            if (symbol == '+') {
                                all = num1 + num2
                            } else if (symbol == '-') {
                                all = num1 - num2
                            } else if (symbol == 'x') {
                                all = num1 * num2
                            } else if (symbol == '÷') {
                                all = num1 / num2
                            }
                            firstDot=true
                            secondDot=false
                            theSecondText=null
                            theFirstText=all.toString()
                            alltext = theFirstText + "+"
                            Text1.setText(alltext)
                            text2.setText("=$theFirstText")
                            amount=1
                            symbol='+'

                        }

                    }
                }

            }

        }
        Button45.setOnClickListener { view ->

            if (theFirstText == null) {
                theFirstText = "0"
                alltext = theFirstText + ""
                Text1.setText(alltext)
                text2.setText("=$theFirstText")

            } else {
                if (amount == 0) {
                    alltext = theFirstText + ""
                    Text1.setText(alltext)
                    text2.setText("=$theFirstText")

                } else {
                    if (theSecondText == null) {
                        alltext = theFirstText + ""
                        Text1.setText(alltext)
                        text2.setText("=$theFirstText")
                        amount=0
                    } else {
                        var str1 = theFirstText
                        var str2 = theSecondText
                        if (str1 != null && str2 != null) {
                            var num1 = str1.toFloat()
                            var num2 = str2.toFloat()
                            var all: Float = 0.0F

                            if (symbol == '+') {
                                all = num1 + num2
                            } else if (symbol == '-') {
                                all = num1 - num2
                            } else if (symbol == 'x') {
                                all = num1 * num2
                            } else if (symbol == '÷') {
                                all = num1 / num2
                            }
                            firstDot=true
                            secondDot=false
                            theFirstText=all.toString()
                            theSecondText=null
                            alltext = theFirstText + ""
                            Text1.setText(alltext)
                            text2.setText("=$theFirstText")
                            amount=0
                        }

                    }
                }

            }


        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("alltext", alltext)
        outState.putString("theSecondText",theSecondText)
        outState.putString("theFirstText", theFirstText)
        outState.putInt("amount", amount)
        outState.putChar("symbol",symbol)
        outState.putBoolean("firstDot",firstDot)
        outState.putBoolean("secondDot",secondDot)

    }
    override fun onStart() {
        super.onStart()
        Text1.setText(alltext)
        if (amount == 1) {
            var str1 = theFirstText
            var str2 = theSecondText
            if (str1 != null && str2 != null) {
                var num1 = str1.toFloat()
                var num2 = str2.toFloat()
                var all: Float = 0.0F

                if (symbol == '+') {
                    all = num1 + num2
                } else if (symbol == '-') {
                    all = num1 - num2
                } else if (symbol == 'x') {
                    all = num1 * num2
                } else if (symbol == '÷') {
                    all = num1 / num2
                }

                text2.setText("=" + all.toString())

            }
        }

            else text2.setText("="+theFirstText)
        Log.e("MainActivity","onStart")
//        if (savedInstanceState == null) {
//
//        } else {
//            alltext = savedInstanceState.getString("alltext")
//            theSecondText=savedInstanceState.getString( "theSecondText")
//            theFirstText=savedInstanceState.getString("theFirstText")
//            amount=savedInstanceState.getInt("amount")
//            symbol=savedInstanceState.getChar("symbol")
//            firstDot=savedInstanceState.getBoolean("firstDot")
//            secondDot=savedInstanceState.getBoolean("secondDot")
//
//
//        }
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity","onResume")
//        setContentView(R.layout.activity_main)
//        if (savedInstanceState == null) {
//
//        } else {
//            alltext = savedInstanceState.getString("alltext")
//            theSecondText=savedInstanceState.getString( "theSecondText")
//            theFirstText=savedInstanceState.getString("theFirstText")
//            amount=savedInstanceState.getInt("amount")
//            symbol=savedInstanceState.getChar("symbol")
//            firstDot=savedInstanceState.getBoolean("firstDot")
//            secondDot=savedInstanceState.getBoolean("secondDot")
//
//
//        }
        }
}