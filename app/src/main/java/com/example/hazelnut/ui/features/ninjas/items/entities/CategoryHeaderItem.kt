package com.example.hazelnut.ui.features.ninjas.items.entities

import ninjavan.swiftninja.mvvm.ui.myearning.items.viewtype.EarningItemType

data class CategoryHeaderItem(
    val title: String,
) : ListItem {
    override val earningType: EarningItemType
        get() = EarningItemType.CATEGORY_HEADER

}