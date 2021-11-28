package com.example.t1digitalreporter.view_holders

import com.example.t1digitalreporter.views.MessageView

interface MessageHolder {
    fun drawMessage(view: MessageView)
    fun onAttach(view: MessageView)
    fun onDetach()
}