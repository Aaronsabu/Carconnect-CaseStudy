package com.hexaware.petpals;

import java.util.ArrayList;
import java.util.List;

public class AdoptionEvent {
    private List<IAdoptable> participants = new ArrayList<>();
    
    public void hostEvent() {
        // Logic to host the adoption event
        System.out.println("Adoption event hosted!");
    }

    public void registerParticipant(IAdoptable participant) {
        participants.add(participant);
    }
}
