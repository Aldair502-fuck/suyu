// SPDX-FileCopyrightText: 2023 yuzu emulator project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.suyu.suyu_emu.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import org.suyu.suyu_emu.adapters.AbstractDiffAdapter
import org.suyu.suyu_emu.adapters.AbstractListAdapter

/**
 * [RecyclerView.ViewHolder] meant to work together with a [AbstractDiffAdapter] or a
 * [AbstractListAdapter] so we can run [bind] on each list item without needing a manual hookup.
 */
abstract class AbstractViewHolder<Model>(binding: ViewBinding) :
    RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(model: Model)
}
