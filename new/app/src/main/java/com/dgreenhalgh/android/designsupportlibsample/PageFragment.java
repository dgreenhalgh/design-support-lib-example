package com.dgreenhalgh.android.designsupportlibsample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PageFragment extends Fragment {

    private static final String ARG_PAGE_INDEX = "PAGE_INDEX";

    private TextView mIndexLabelTextView;

    private int mPageIndex;

    public static Fragment newInstance(int pageIndex) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_INDEX, pageIndex);
        Fragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageIndex = getArguments().getInt(ARG_PAGE_INDEX);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);

        mIndexLabelTextView = (TextView) view.findViewById(R.id.fragment_page_index_label);
        String pageLabel = getString(R.string.fragment_page_index_label, mPageIndex + 1);
        mIndexLabelTextView.setText(pageLabel);

        return view;
    }
}
