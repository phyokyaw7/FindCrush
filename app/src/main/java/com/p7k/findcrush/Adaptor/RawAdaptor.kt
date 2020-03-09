package com.p7k.findcrush.Adaptor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.p7k.findcrush.Mode.Raw
import com.p7k.findcrush.R
import kotlinx.android.synthetic.main.item_list.view.*

class RawAdapter(var rawlist : ArrayList<Raw>) : RecyclerView.Adapter<RawAdapter.RawViewHolder>() {
    inner class RawViewHolder (var view: View): RecyclerView.ViewHolder(view){
        fun bindRaw (raw : Raw){
            view.profilePic.setImageResource(raw.postimage)
            view.nameID.text = raw.nameID
            view.postTime.text = raw.postTime
            view.postImage.setImageResource(raw.postimage)
            view.loveNo.text = raw.loveNo
            view.commentNo.text = raw.commentNo
            view.shareNo.text = raw.shareNo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RawViewHolder {
        var myView = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return RawViewHolder(myView)
    }

    override fun getItemCount(): Int {
        return rawlist.size
    }

    override fun onBindViewHolder(holder: RawViewHolder, position: Int) {
        holder.bindRaw(rawlist.get(position))
    }

}