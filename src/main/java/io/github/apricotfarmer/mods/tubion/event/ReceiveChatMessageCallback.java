package io.github.apricotfarmer.mods.tubion.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public interface ReceiveChatMessageCallback {
    Event<ReceiveChatMessageCallback> EVENT = EventFactory.createArrayBacked(ReceiveChatMessageCallback.class,
            (listeners) -> (message) -> {
                for (ReceiveChatMessageCallback listener : listeners) {
                    ActionResult result = listener.interact(message);

                    if (result != ActionResult.PASS) {
                        return result;
                    }
                }
                return ActionResult.PASS;
            });
    ActionResult interact(Text message);
}
