package com.tutorials.hp.dragtree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.allyants.draggabletreeview.DraggableTreeView;
import com.allyants.draggabletreeview.SimpleTreeViewAdapter;
import com.allyants.draggabletreeview.TreeNode;

public class MainActivity extends AppCompatActivity {

    //DECALARTIONS
    DraggableTreeView draggableTreeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.initializeViews();
        this.bindTreeData();

    }

    /*
    INITIALIZE VIEWS
     */
    private void initializeViews() {
        draggableTreeView = (DraggableTreeView) findViewById(R.id.mDraggableTreeView);
    }

    /*
    BIND TREE DATA
     */
    private void bindTreeData()
    {
        TreeNode root=new TreeNode(this);
        TreeNode milkyway=new TreeNode("Milky Way");
        TreeNode andromeda=new TreeNode("Andromeda");

        TreeNode sun=new TreeNode("Sun");
        sun.addChild(new TreeNode("Earth"));
        sun.addChild(new TreeNode("Jupiter"));
        sun.addChild(new TreeNode("Saturn"));
        sun.addChild(new TreeNode("Africa"));
        sun.addChild(new TreeNode("Uropa"));
		sun.addChild(new TreeNode("Universe"));

        milkyway.addChild(sun);
        milkyway.addChild(new TreeNode("Alpha Centauri"));
        milkyway.addChild(new TreeNode("Proxima Centauri"));
		milkyway.addChild(new TreeNode("Mars"));

        root.addChild(new TreeNode("Whirlpool"));
        root.addChild(new TreeNode("Neptune"));
        root.addChild(new TreeNode("Galaxy"));
        root.addChild(new TreeNode("Canis Majos"));
		root.addChild(new TreeNode("North America"));
        root.addChild(new TreeNode("Asia"));
		root.addChild(new TreeNode("New York"));
		root.addChild(new TreeNode("Nairobi"));


        root.addChild(andromeda);
        root.addChild(milkyway);

        SimpleTreeViewAdapter adapter=new SimpleTreeViewAdapter(this,root);
        draggableTreeView.setAdapter(adapter);


    }


}
