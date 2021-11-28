package com.example.t1digitalreporter.ui.screens.qr

import android.graphics.Bitmap
import android.graphics.Color
import com.example.t1digitalreporter.R
import com.example.t1digitalreporter.database.USER
import com.example.t1digitalreporter.ui.screens.base.BaseFragment
import com.example.t1digitalreporter.utilits.APP_ACTIVITY
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import kotlinx.android.synthetic.main.fragment_q_r.*

class QRFragment : BaseFragment(R.layout.fragment_q_r) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Ваш QR-id"

        val imageView = image_qr
        val content = "USER.phone"
        val writer = QRCodeWriter()
        val bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, 512, 512)
        val width = bitMatrix.width
        val height = bitMatrix.height
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)
        for (x in 0 until width) {
            for (y in 0 until height) {
                bitmap.setPixel(x, y, if (bitMatrix.get(x, y)) Color.BLACK else Color.WHITE)
            }
        }
        imageView.setImageBitmap(bitmap)
    }
}