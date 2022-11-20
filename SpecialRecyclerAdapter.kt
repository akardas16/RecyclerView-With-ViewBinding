package com.akardas.viewmodelexamples

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.akardas.viewmodelexamples.databinding.RecyclerItemsBinding

class SpecialRecyclerAdapter(private val paymentList: List<String>, private val context: Context) : RecyclerView.Adapter<SpecialRecyclerAdapter.PaymentHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentHolder {
        val itemBinding = RecyclerItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PaymentHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PaymentHolder, position: Int) {

       holder.bind(paymentList[position],position,context)
    }

    override fun getItemCount(): Int = paymentList.size

    class PaymentHolder(private val binding: RecyclerItemsBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(text:String,position: Int,context: Context) {
            binding.buttonItem.text = text
            binding.buttonItem.setOnClickListener {
                Toast.makeText(context,"$position",Toast.LENGTH_SHORT).show()
            }
        }
    }
}