package com.edurda77.qrworker.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.edurda77.qrworker.domain.utils.CODE_USER
import com.edurda77.qrworker.domain.utils.GUID_PRODUCTION_REPORT
import com.edurda77.qrworker.domain.utils.GUID_TECH_OPERATION
import com.edurda77.qrworker.domain.utils.ID
import com.edurda77.qrworker.domain.utils.IS_UPLOAD
import com.edurda77.qrworker.domain.utils.TABLE
import com.edurda77.qrworker.domain.utils.TIME_SCAN

@Entity(tableName = TABLE)
data class CodeEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    val id: Int = 0,
    @ColumnInfo(name = CODE_USER)
    val codeUser: String,
    @ColumnInfo(name = TIME_SCAN)
    val timeOfScan: String,
    @ColumnInfo(name = GUID_TECH_OPERATION)
    val techOperation: String,
    @ColumnInfo(name = GUID_PRODUCTION_REPORT)
    val productionReport: String,
    @ColumnInfo(name = IS_UPLOAD)
    val isUpload: Boolean = false,
)