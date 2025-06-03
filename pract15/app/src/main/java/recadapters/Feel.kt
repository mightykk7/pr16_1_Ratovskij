package recadapters

import com.example.pract15.R

data class Feel(val image:Int, val nameFeel:String)
class MyFeel {
    val list = arrayListOf(Feel(R.drawable.calm, "Спокойным"),
        Feel(R.drawable.relax, "Расслабленным"),
        Feel(R.drawable.focus, "Сосредоточенным"),
        Feel(R.drawable.anxious, "Взволнованным")
    )
}
