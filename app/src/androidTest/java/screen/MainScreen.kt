package screen

import com.example.myapplication.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton

object MainScreen : KScreen<MainScreen>() {
    override val layoutId: Int?
        get() = R.layout.activity_main
    override val viewClass: Class<*>?
        get() = MainScreen::class.java

    val button = KButton { withId(R.id.button) }
}