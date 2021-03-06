package com.example.popularpeople.presentation.main.popular_details

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.popularpeople.databinding.ItemImageViewBinding
import com.example.popularpeople.presentation.base.BaseItemListener
import com.example.popularpeople.presentation.base.BaseRecyclerViewAdapter
import com.example.popularpeople.presentation.base.BaseViewHolder

class ImagesAdapter(
    items: MutableList<ImageDataItem>,
    itemListener: ImageItemViewModelListener
) : BaseRecyclerViewAdapter<ImageDataItem>(items, itemListener) {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return ImagesViewHolder(
            ItemImageViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    inner class ImagesViewHolder(private val mBinding: ItemImageViewBinding) :
        BaseViewHolder(mBinding.root) {
        override fun onBind(position: Int) {
            val imageDataItem = items[position]
            mBinding.imageDataItem = imageDataItem
            mBinding.item = ImageItemView { itemListener.onItemClick(imageDataItem) }
            mBinding.executePendingBindings()
        }
    }
}

interface ImageItemViewModelListener : BaseItemListener<ImageDataItem> {
    override fun onRetryClick() {}
}