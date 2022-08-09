package screen

import com.example.myapplication.R
import com.example.myapplication.SecondActivity
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KTextView

object SecondScreen : KScreen<SecondScreen>() {
    override val layoutId: Int?
        get() = R.layout.second
    override val viewClass: Class<*>?
        get() = SecondActivity::class.java

    val textField = KTextView { withId(R.id.textView) }
}