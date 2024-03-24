// SPDX-FileCopyrightText: 2023 yuzu emulator project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.suyu.suyu_emu.model

import org.suyu.suyu_emu.utils.GpuDriverMetadata

data class Driver(
    override var selected: Boolean,
    val title: String,
    val version: String = "",
    val description: String = ""
) : SelectableItem {
    override fun onSelectionStateChanged(selected: Boolean) {
        this.selected = selected
    }

    companion object {
        fun GpuDriverMetadata.toDriver(selected: Boolean = false): Driver =
            Driver(
                selected,
                this.name ?: "",
                this.version ?: "",
                this.description ?: ""
            )
    }
}
