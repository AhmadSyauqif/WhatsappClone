package com.pesan.whatsappclone.listener

interface ChatClickListener {
    fun onChatClicked(
        chatId: String?,
        otherUserId: String?,
        chatsImageUrl: String?,
        chatsName: String?

    )
}