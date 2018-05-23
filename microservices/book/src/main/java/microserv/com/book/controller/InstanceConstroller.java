package microserv.com.book.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("instance")
@RequiredArgsConstructor
public class InstanceConstroller {
	
	private final DiscoveryClient discoveryClient;

	@GetMapping
	public List<String> getInstances() {
		return discoveryClient.getServices();
	}

}
