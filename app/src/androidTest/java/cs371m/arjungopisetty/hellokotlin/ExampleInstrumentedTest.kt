package cs371m.arjungopisetty.hellokotlin

import android.content.Context
import androidx.test.InstrumentationRegistry
import androidx.test.InstrumentationRegistry.getTargetContext
import androidx.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    private lateinit var context: Context

    @Before
    fun initTargetContext() {
        context = getTargetContext()
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("cs371m.arjungopisetty.hellokotlin", appContext.packageName)
    }

    @Test
    fun verifyResourceFromLibrary() {
        assertEquals(context.getString(R.string.app_name),
                "HelloKotlin")
    }
}
