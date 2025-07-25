package com.example.pyspersonel.controller;
import com.example.pyspersonel.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @Autowired
    private com.example.pyspersonel.mapper.TransferMapper transferMapper;

    @GetMapping
    public List<com.example.pyspersonel.dto.TransferDTO> getAll() {
        List<com.example.pyspersonel.entity.Transfer> entities = transferService.findAll();
        return entities.stream().map(transferMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public com.example.pyspersonel.dto.TransferDTO getById(@PathVariable Integer id) {
        return transferService.findById(id)
                .map(transferMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public com.example.pyspersonel.dto.TransferDTO create(@RequestBody com.example.pyspersonel.dto.TransferDTO dto) {
        com.example.pyspersonel.entity.Transfer entity = transferMapper.toEntity(dto);
        com.example.pyspersonel.entity.Transfer saved = transferService.save(entity);
        return transferMapper.toDto(saved);
    }

    @PutMapping("/{id}")
    public com.example.pyspersonel.dto.TransferDTO update(@PathVariable Integer id, @RequestBody com.example.pyspersonel.dto.TransferDTO dto) {
        com.example.pyspersonel.entity.Transfer updated = transferService.update(id, dto);
        return transferMapper.toDto(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        transferService.deleteById(id);
    }
}
