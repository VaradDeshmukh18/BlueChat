package com.vaddy.bluechat.domain.chat

import java.io.IOException

class TransferFailedException: IOException("Reading incoming data failed")