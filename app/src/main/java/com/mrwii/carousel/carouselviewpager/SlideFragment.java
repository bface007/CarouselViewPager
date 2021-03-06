package com.mrwii.carousel.carouselviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


public class SlideFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "pageNumber";
    private String mParam;
    private TextView tvPos;

    public SlideFragment() {
        // Required empty public constructor
    }

    public static SlideFragment newInstance(String pageNumber) {
        Bundle args = new Bundle();
        args.putString(ARG_PAGE_NUMBER, pageNumber);

        SlideFragment fragment = new SlideFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam = getArguments().getString(ARG_PAGE_NUMBER);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout root = (FrameLayout) inflater.inflate(R.layout.fragment_slide, container, false);
        tvPos = (TextView) root.findViewById(R.id.text);
        tvPos.setText("Page " + mParam);
        return root;
    }

}
