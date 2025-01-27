package com.immersion.riot.match.api.champion_stat;

import com.immersion.riot.match.app.dto.ChampionStatResponse;
import com.immersion.riot.match.app.service.ImageUrlBuilderService;
import com.immersion.riot.match.query.ChampionStatQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChampionStatQueryApi {

    private final ChampionStatQueryService championStatQueryService;

    @GetMapping("/match/stat/{puuid}")
    public ResponseEntity<List<ChampionStatResponse>> getChampionStatsByPuuid(@PathVariable String puuid) {
        List<ChampionStatResponse> championStatResponses = championStatQueryService.getMostChampionByPuuid(puuid);

        return ResponseEntity.ok(championStatResponses);
    }


}
