package com.andreacioccarelli.musicdownloader.data.serializers

/**
 *  Designed and developed by Andrea Cioccarelli
 */

data class UpdateCheck(
        val versionCode: Int,
        val versionName: String,
        val changelog: String,
        val downloadInfo: DownloadInfo
)

data class DownloadInfo(val useBundledUpdateLink: Boolean, val updateLink: String?)