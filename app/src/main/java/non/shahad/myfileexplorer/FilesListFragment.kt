package non.shahad.myfileexplorer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import non.shahad.myfileexplorer.databinding.FragmentFileslistBinding

class FilesListFragment : Fragment(){
    companion object{
        private const val ARG_PATH : String = "non.shahad.myfileexplorer"

        fun build(block : Builder.() -> Unit) = Builder().apply(block).build()
    }

    private lateinit var binding: FragmentFileslistBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_fileslist,container,false)
        return binding.root
    }


    class Builder {
        var path : String = ""

        fun build() : FilesListFragment {
            val fragment = FilesListFragment()
            val args = Bundle()

            args.putString(ARG_PATH,path)
            fragment.arguments = args
            return fragment
        }
    }





}