package recadapters

import com.example.pract15.R

data class State(val title:String, val textState:String, val imageState: Int)
class MyState{
    val stateList = arrayListOf(State("Заголовок блока","Кратенькое описание блока с двумя строчками", R.drawable.block1),
        State("Заголовок блока", "Кратенькое описание блока с двумя строчками", R.drawable.block2))
}