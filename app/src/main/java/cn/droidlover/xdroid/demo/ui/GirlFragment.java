package cn.droidlover.xdroid.demo.ui;


import cn.droidlover.xdroid.base.SimpleRecBindingViewHolder;
import cn.droidlover.xdroid.demo.adapter.GirlAdapter;
import cn.droidlover.xdroid.demo.databinding.AdapterGirlBinding;
import cn.droidlover.xdroid.demo.model.GankResults;
import cn.droidlover.xdroidbase.base.SimpleItemCallback;
import cn.droidlover.xdroidbase.base.SimpleRecAdapter;
import cn.droidlover.xrecyclerview.RecyclerItemCallback;
import cn.droidlover.xrecyclerview.XRecyclerView;

/**
 * Created by wanglei on 2016/12/10.
 */

public class GirlFragment extends BasePagerFragment {

    GirlAdapter adapter;

    @Override
    public SimpleRecAdapter getAdapter() {
        if (adapter == null) {
            adapter = new GirlAdapter(context);
            adapter.setItemClick(new SimpleItemCallback<GankResults.Item,
                    SimpleRecBindingViewHolder<AdapterGirlBinding>>() {

                @Override
                public void onItemClick(int position, GankResults.Item model, int tag,
                                        SimpleRecBindingViewHolder<AdapterGirlBinding> holder) {
                    super.onItemClick(position, model, tag, holder);
                }
            });
        }
        return adapter;
    }

    @Override
    public void setLayoutManager(XRecyclerView recyclerView) {
        recyclerView.gridLayoutManager(context, 2);
    }

    @Override
    public String getType() {
        return "福利";
    }

    public static GirlFragment newInstance() {
        return new GirlFragment();
    }


}
