package com.company.planner.screen.talk;

import com.company.planner.entity.Talk;
import io.jmix.ui.screen.*;

@UiController("plnnr_Talk.edit")
@UiDescriptor("talk-edit.xml")
@EditedEntityContainer("talkDc")
public class TalkEdit extends StandardEditor<Talk> {

    @Subscribe
    public void onInitEntity(InitEntityEvent<Talk> event) {
        event.getEntity().setDuration(1);
    }
}