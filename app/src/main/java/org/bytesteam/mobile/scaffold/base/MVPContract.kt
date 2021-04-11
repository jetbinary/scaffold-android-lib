package org.bytesteam.mobile.scaffold.base

interface MVPContract {

    interface View {
        fun showLogon()
        fun showError(message: String)
        fun hideError()
    }

    interface Presenter<T : View> {
        fun onError(localErrorHandler: ((Throwable) -> Boolean)? = null): ((Throwable) -> Unit)
    }
}