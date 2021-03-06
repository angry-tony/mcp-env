node ('python'){
  stage('Run nightly tests'){
    build(
          job: 'create-mcp-env',
          parameters: [
              string(name: 'STACK_NAME', value: 'night-os-cicd-sl-ovs'),
              string(name: 'OS_PROJECT_NAME', value: 'mcp-scale'),
              string(name: 'OS_AZ', value: 'mcp-scale'),
              string(name: 'STACK_INSTALL', value: 'core,cicd,openstack,stacklight,ovs'),
          ],
          propagate: true,
          wait: true,
      )
  }
}
