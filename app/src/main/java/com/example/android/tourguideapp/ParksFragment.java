/*
 * PROJECT LICENSE
 *
 * This project was submitted by Janas Chatkevicius as part of the Nanodegree At Udacity.
 *
 * As part of Udacity Honor code, your submissions must be your own work, hence
 * submitting this project as yours will cause you to break the Udacity Honor Code
 * and the suspension of your account.
 *
 * Me, the author of the project, allow you to check the code as a reference, but if
 * you submit it, it's your own responsibility if you get expelled.
 *
 * Copyright (c) 2018 Janas Chatkevicius
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.battery_park_name), getString(R.string.battery_park_rating), R.drawable.batterypark));
        items.add(new Item(getString(R.string.central_park_name), getString(R.string.central_park_rating), R.drawable.centralpark));
        items.add(new Item(getString(R.string.bryant_park_name), getString(R.string.bryant_park_rating), R.drawable.bryantpark));
        items.add(new Item(getString(R.string.carl_schurz_park_name), getString(R.string.carl_schurz_park_rating), R.drawable.carlschurzpark));
        items.add(new Item(getString(R.string.washington_park_name), getString(R.string.washington_park_rating), R.drawable.washingtonsquare));
        items.add(new Item(getString(R.string.high_line_name), getString(R.string.high_line_rating), R.drawable.highline));

        ItemAdapter adapter = new ItemAdapter(getActivity(), 0, items);
        ListView listView = (ListView) rootView.findViewById(R.id.items_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }
}
