package com.refr.www;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by samarth on 12/10/14.
 */
public class previewAdapter extends BaseExpandableListAdapter {
    private Context previewContext;
    String[] categories = {
            "Background",
            "Education",
            "Experience",
            "Interests",
            "Skills",
            "Projects",
            "Additional"};
    String[][] details = {{"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur omnis consequuntur adipisci laboriosam tempora veritatis! Eum laboriosam sit, rerum quia magni doloribus ut exercitationem, officia repudiandae nihil minima repellendus nemo."},
            {"Asperiores in doloribus sapiente, at quia dicta officiis laboriosam, quisquam deleniti maiores reiciendis suscipit. Sunt ullam possimus sint impedit nisi iure velit ratione quod perspiciatis, doloribus numquam facilis dolore quia?"},
            {"Voluptate hic eos accusantium molestias perferendis neque sapiente porro fugit non reiciendis cumque, suscipit nesciunt harum mollitia iste facere incidunt a magnam accusamus in dolorem! Quidem veritatis cum, enim est."},
            {"Iusto iste, et autem cumque non vero repellat enim placeat ex magnam. Minima, cupiditate consequatur laborum asperiores nobis mollitia temporibus iusto doloremque placeat recusandae saepe blanditiis suscipit voluptates distinctio delectus."},
            {"Suscipit dolores, laudantium facilis atque ad eaque ut in odit possimus voluptatem architecto, veritatis reiciendis molestias? Blanditiis error enim perferendis earum neque, ipsam quis harum maxime porro soluta accusamus voluptatem."},
            {"Fugit architecto provident at dignissimos quis repudiandae odio vitae sint, laboriosam quibusdam voluptatibus qui mollitia, natus iure numquam quam inventore, alias doloribus praesentium sapiente tempore delectus cupiditate modi commodi! Soluta."},
            {"Fugit architecto provident at dignissimos quis repudiandae odio vitae sint, laboriosam quibusdam voluptatibus qui mollitia, natus iure numquam quam inventore, alias doloribus praesentium sapiente tempore delectus cupiditate modi commodi! Soluta."}};

public previewAdapter(Context previewContext){
        this.previewContext=previewContext;
        }

@Override
public int getGroupCount(){
        return categories.length;
        }

@Override
public int getChildrenCount(int i){
        return details[i].length;
        }

@Override
public Object getGroup(int i){
        return i;
        }

@Override
public Object getChild(int i,int i2){
        return null;
        }

@Override
public long getGroupId(int i){
        return i;
        }

@Override
public long getChildId(int i,int i2){
        return 0;
        }

@Override
public boolean hasStableIds(){
        return false;
        }

@Override
public View getGroupView(int i,boolean b,View view,ViewGroup viewGroup){
    TextView tv=new TextView(previewContext);
    tv.setText(categories[i]);
    tv.setPadding(30,0,0,0);
    return tv;

        }

@Override
public View getChildView(int i,int i2,boolean b,View view,ViewGroup viewGroup){
    TextView tv=new TextView(previewContext);
    tv.setText(details[i][i2]);
    tv.setPadding(10,0,0,0);
    return tv;

        }

@Override
public boolean isChildSelectable(int i,int i2){
        return true;
        }
        }
