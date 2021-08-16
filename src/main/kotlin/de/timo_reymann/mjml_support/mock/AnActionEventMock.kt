package de.timo_reymann.mjml_support.mock

import com.intellij.ide.DataManager
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.actionSystem.Presentation
import org.jetbrains.concurrency.await
import javax.swing.JComponent

/**
 * Create an empty AnActionEvent
 */
class AnActionEventMock() : AnActionEvent( null,
     DummyDataContext(),
    "",
    Presentation(),
    ActionManager.getInstance(),
    0) {
}

internal class DummyDataContext : DataContext {
    override fun getData(dataId: String): Any? {
        return null
    }
}
